package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");

        return hashSet;

    }

    public Set<String> construirLinkedHashSet(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");

        return linkedHashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> treSet = new TreeSet<>();
        treSet.add("A");
        treSet.add("B");
        treSet.add("C");
        treSet.add("A");
        treSet.add("D");
        treSet.add("E");
        treSet.add("F");
        treSet.add("1Ggggggeegeg");
        treSet.add("2G2gggggeegeg");
        treSet.add("3Gggggeegeg");
        treSet.add("4Ggggggeegeg");
        treSet.add("5Ggggggeegeg");
        treSet.add("5Ggggggeegeg");
        treSet.add("6Ggggggeegeg");
        treSet.add("G7gggggeegeg");
        return treSet;
    }

    public Set<Contacto> construirTreeSetConComparador(){
        
        Set<Contacto> tCSet = new TreeSet<>((c1, c2) -> {

            return c1.getNombre().compareTo(c2.getNombre());
        });




        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Juan", "Lopez", "123456789")); // Duplicado, no se agregará
        
        return tCSet;
    }

    public Set<Contacto> construirHashSetContacto(){
        Set<Contacto> hCSet = new TreeSet<>();

        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789");
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789"); // Duplicado, no se agregará
        System.out.println("Contacto c1: " + c1.hashCode());
        System.out.println("Contacto c5: " + c5.hashCode());
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);
        return hCSet;
    }
}
