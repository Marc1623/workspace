package main;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    @Test
    void testHero() {
        assertTrue(Modifier.isAbstract(Hero.class.getModifiers()));
    }

    @Test
    void testDwarf() {
        Dwarf dwarf = new Dwarf();
        Exception ex = null;

        assertThrows(ArithmeticException.class, () -> dwarf.setStrength(-1));
        assertThrows(ArithmeticException.class, () -> dwarf.setXp(-1));
        assertThrows(ArithmeticException.class, () -> dwarf.setHealth(-1));

        String name = "Gimli";
        int strength = 100;
        int xp = 200;
        int health = 300;

        try {
            dwarf.setName(name);
            assertTrue(name.equals(dwarf.getName()));

            dwarf.setStrength(strength);
            assertEquals(strength, dwarf.getStrength());

            dwarf.setXp(xp);
            assertEquals(xp, dwarf.getXp());

            dwarf.setHealth(health);
            assertEquals(health, dwarf.getHealth());

        } catch (Exception e) {
            ex = e;
        }

        assertNull(ex);

        String description = dwarf.toString();
        assertTrue(description.contains(name));
        assertTrue(description.toLowerCase().contains(dwarf.getClass().getSimpleName().toLowerCase()));
        assertTrue(description.contains(Integer.toString(strength)));
        assertTrue(description.contains(Integer.toString(xp)));
        assertTrue(description.contains(Integer.toString(health)));
    }

    @Test
    void testAddXp() {
        Dwarf dwarf = new Dwarf();
        Exception ex = null;

        String name = "Gimli";
        int strength = 100;
        int xp = 0;
        int health = 300;

        try {
            dwarf.setName(name);
            dwarf.setStrength(strength);
            dwarf.setXp(xp);
            dwarf.setHealth(health);

            for (int i=0; i<Integer.MAX_VALUE; i++) {
                dwarf.addXp(1);
                assertEquals((i+1), dwarf.getXp());
            }

            dwarf.addXp(1);
            assertEquals(Integer.MAX_VALUE, dwarf.getXp());

            dwarf.addXp(100);
            assertEquals(Integer.MAX_VALUE, dwarf.getXp());

            dwarf.addXp(Integer.MAX_VALUE);
            assertEquals(Integer.MAX_VALUE, dwarf.getXp());

        } catch (Exception e) {
            ex = e;
        }
        assertNull(ex);

        assertThrows(ArithmeticException.class, () -> dwarf.addXp(-1));
    }

    @Test
    void testWizard() {
        Wizard wizard = new Wizard();
        Exception ex = null;

        assertThrows(ArithmeticException.class, () -> wizard.setMana(-1));
        assertThrows(ArithmeticException.class, () -> wizard.setXp(-1));
        assertThrows(ArithmeticException.class, () -> wizard.setHealth(-1));

        String name = "Gandalf";
        int mana = 100;
        int xp = 200;
        int health = 300;

        try {
            wizard.setName(name);
            assertTrue(name.equals(wizard.getName()));

            wizard.setMana(mana);
            assertEquals(mana, wizard.getMana());

            wizard.setXp(xp);
            assertEquals(xp, wizard.getXp());

            wizard.setHealth(health);
            assertEquals(health, wizard.getHealth());

        } catch (Exception e) {
            ex = e;
        }

        assertNull(ex);

        String description = wizard.toString();
        assertTrue(description.contains(name));
        assertTrue(description.toLowerCase().contains(wizard.getClass().getSimpleName().toLowerCase()));
        assertTrue(description.contains(Integer.toString(mana)));
        assertTrue(description.contains(Integer.toString(xp)));
        assertTrue(description.contains(Integer.toString(health)));
    }


    @Test
    void createCompany() {

        Exception ex = null;
        String wName = "Gandalf";
        int wMana = 3;
        int wHealth = 2;
        int wXp = 1;
        String dName = "Gimli";
        int dStrength = 6;
        int dHealth = 5;
        int dXp = 4;
        String myCompany = "Wizard," + wName + "," + wXp + "," + wHealth + "," + wMana +
                "\nDwarf," + dName + "," + dXp + "," + dHealth + "," + dStrength;

        try {
            File testData = File.createTempFile("oopexam", ".txt");
            testData.deleteOnExit();
            BufferedWriter bw = new BufferedWriter(new FileWriter(testData));
            bw.write(myCompany);
            bw.close();

            Company lotr = new Company("The Fellowship of the Ring");
            lotr.hire(testData);

            assertEquals(2, lotr.getNbHeroes());

            Hero hero = lotr.getHero(0);
            assertTrue(hero instanceof Wizard);
            assertTrue(wName.equals(hero.getName()));
            assertEquals(wMana, ((Wizard) hero).getMana());
            assertEquals(wHealth, hero.getHealth());
            assertEquals(wXp, hero.getXp());

            hero = lotr.getHero(1);
            assertTrue(hero instanceof Dwarf);
            assertTrue(dName.equals(hero.getName()));
            assertEquals(dStrength, ((Dwarf) hero).getStrength());
            assertEquals(dHealth, hero.getHealth());
            assertEquals(dXp, hero.getXp());

            assertThrows(IndexOutOfBoundsException.class, () -> lotr.getHero(2));

        } catch (Exception e) {
            ex = e;
        }

        assertNull(ex);
    }

    @Test
    void createCompanyWithInvalidData() {
        String[] myHeroes = {
                "Wizard,Gandalf,1,2,-1",
                "Wizard,Gandalf,1,2,one",
                "Wizard,Gandalf,1,2",
                "Hobbit,Bilbo,1,2,3",
                "Wizard,Gandalf,1,2,3,4",
                " ",
                ",",
                " , , , , ,",
                "Dwarf,Gimli,one,two,three"
        };
        Exception ex = null;
        int idx = 0;

        Company lotr = new Company("The Fellowship of the Ring");

        for (String myHero: myHeroes) {

            try {
                File testData = File.createTempFile("createCompanyWithInvalidData" + idx, ".txt");
                testData.deleteOnExit();
                BufferedWriter bw = new BufferedWriter(new FileWriter(testData));
                bw.write(myHero);
                bw.close();

                assertThrows(HireHeroException.class, () -> lotr.hire(testData));
            } catch (Exception e) {
                ex = e;
            }
        }
        assertNull(ex);
    }

    @Test
    void createCompanyWithValidAndInvalidData() {
        Exception ex = null;
        String wName = "Gandalf";
        int wMana = 3;
        int wHealth = 2;
        int wXp = 1;
        String dName = "Gimli";
        int dStrength = 6;
        int dHealth = 5;
        int dXp = 4;
        String myCompany = "Wizard," + wName + "," + wXp + "," + wHealth + "," + wMana +
                "\nWarrior,conan,100,200,200" +
                "\nDwarf," + dName + "," + dXp + "," + dHealth + "," + dStrength;
        File testData;

        try {
            testData = File.createTempFile("oopexam", ".txt");
            testData.deleteOnExit();
            BufferedWriter bw = new BufferedWriter(new FileWriter(testData));
            bw.write(myCompany);
            bw.close();


            Company lotr = new Company("The Fellowship of the Ring");

            // The second line of the file contains an unknown class
            assertThrows(HireHeroException.class, () -> lotr.hire(testData));

            // Our company should have a single member
            assertEquals(1, lotr.getNbHeroes());

            Hero hero = lotr.getHero(0);
            assertTrue(hero instanceof Wizard);
            assertTrue(wName.equals(hero.getName()));
            assertEquals(wMana, ((Wizard) hero).getMana());
            assertEquals(wHealth, hero.getHealth());
            assertEquals(wXp, hero.getXp());

        } catch (Exception e) {
            ex = e;
        }
        assertNull(ex);
    }

    @Test
    void createCompanyWithTooManyHeroes() {
        String[] myHeroes = {
                "Wizard,Gandalf,1,27,3",
                "Dwarf,Gimli,40,5,61",
                "Wizard,Saruman,100,200,300",
                "Dwarf,Balin,45,56,12",
                "Dwarf,Dain,6,67,19",
                "Dwarf,Durin,8,8,8",
                "Dwarf,Thror,99,77,2",
                "Dwarf,Thrain,183,45,7",
                "Dwarf,Thorin,45,78,3",
                "Dwarf,Gloin,110,2,5",
                "Wizard,Galadriel,200,200,200",
                "Dwarf,Grumpy,1,1,1",
        };

        Exception ex = null;
        Company lotr = new Company("The Fellowship of the Ring");

        for (int idx = 0; idx<myHeroes.length; idx++) {

            try {
                File testData = File.createTempFile("createCompanyWithInvalidData" + idx, ".txt");
                testData.deleteOnExit();
                BufferedWriter bw = new BufferedWriter(new FileWriter(testData));
                bw.write(myHeroes[idx]);
                bw.close();

                if (idx < 10) {
                    lotr.hire(testData);
                }
                else {
                    assertThrows(HireHeroException.class, () -> lotr.hire(testData));
                }

            } catch (Exception e) {
                ex = e;
            }
        }
        assertNull(ex);
        assertEquals(10, lotr.getNbHeroes());
    }

}
