package co.edu.uniquindio.poo;

public record Mascota (String nombre, String especie, String raza, Byte edad, String genero,String color , Double peso) {
    public Mascota {
        assert nombre != null;
        assert especie != null;
        assert raza !=null;
        assert edad!=null;
        assert genero!=null;
        assert color !=null;
        assert peso != null;
        assert edad >= (byte) 3;
        assert nombre != "";
        assert raza !="";
        assert peso != (double)0;
     }
    }