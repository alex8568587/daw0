/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

/**
 *
 * @author confalonieri
 */
public class Categoria {

    private Integer id;
    private String nombre;
    private String imagen;
    private ArrayList<Producto> productoList;

    /*Producto leche;
    private Producto queso;
    private Producto mantequilla;
    private Producto huevos;
    private Producto hamburguesas;
    private Producto jamon;
    private Producto pollo;
    private Producto salsichas;
    private Producto panGirasol;
    private Producto panSesamo;
    private Producto panSemilla;
    private Producto galletas;
    private Producto maiz;
    private Producto ribes;
    private Producto broccoli;
    private Producto sandia;*/

    public Categoria() {
    }

    public Categoria(int id) throws Exception {

        switch (id) {
            case 1:
                this.id = 1;
                this.nombre = "lácteos";
                this.imagen = "lacteos.jpg";

                break;
            case 2:
                this.id = 2;
                this.nombre = "carnes";
                this.imagen = "carnes.jpg";

                break;
            case 3:
                this.id = 3;
                this.nombre = "panadería";
                this.imagen = "panadera.jpg";

                break;
            case 4:
                this.id = 4;
                this.nombre = "frutas & verduras";
                this.imagen = "frutas & verduras.jpg";
                break;
            default:

        }

    }

    public Categoria(int id, String nombre, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public ArrayList<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(ArrayList<Producto> productoList) {
        this.productoList = productoList;
    }

    
    public ArrayList<Producto> getProductoList(int parseInt) {

        ArrayList<Producto> productos = new ArrayList<Producto>();
        /*
        switch (id) {
            case 1:
                leche = new Producto(1, "leche", 1.70, "semi desnatado (1L)", "leche.png", 1);
                queso = new Producto(2, "queso", 2.39, "curado (330g)", "queso.png", 1);
                mantequilla = new Producto(3, "mantequilla", 1.09, "light (250g)", "mantequilla.png", 1);
                huevos = new Producto(4, "huevos", 1.76, "de campo (6 eggs)", "huevos.png", 1);
                productos.add(leche);
                productos.add(queso);
                productos.add(mantequilla);
                productos.add(huevos);

                break;
            case 2:
                hamburguesas = new Producto(5, "hamburguesas", 2.29, "con hierbas finas (250g)", "hamburguesas.png", 2);
                jamon = new Producto(6, "jamon serrano", 3.49, "(70g)", "jamon serrano.png", 2);
                pollo = new Producto(7, "pollo", 2.59, "(250g)", "pollo.png", 2);
                salsichas = new Producto(8, "salsichas", 3.55, "mixtas (350g)", "salsichas.png", 2);
                productos.add(hamburguesas);
                productos.add(jamon);
                productos.add(pollo);
                productos.add(salsichas);

                break;
            case 3:
                panGirasol = new Producto(9, "pan con semilla girasol", 1.89, "600g", "pan con semilla girasol.png", 3);
                panSesamo = new Producto(10, "pane con semillas de sésamo", 1.19, "4 panecillos", "pane con semillas de sesamo.png", 3);
                panSemilla = new Producto(11, "pan de semilla", 1.15, "con calabaza 4 bollos", "pan de semilla.png", 3);
                galletas = new Producto(12, "galletas xocolate", 2.39, "3 galetas", "galletas xocolate.png", 3);
                productos.add(panGirasol);
                productos.add(panSesamo);
                productos.add(panSemilla);
                productos.add(galletas);

                break;
            case 4:
                maiz = new Producto(13, "maíz", 1.59, "2 piezas", "maiz.png", 4);
                ribes = new Producto(14, "ribes", 2.49, "150g", "ribes.png", 4);
                broccoli = new Producto(15, "broccoli", 1.29, "500g", "broccoli.png", 4);
                sandia = new Producto(16, "sandía", 1.49, "250g", "sandia.png", 4);
                productos.add(maiz);
                productos.add(ribes);
                productos.add(broccoli);
                productos.add(sandia);
                break;
            default:

        }
        */
        return productos;

    }

}
