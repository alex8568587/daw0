/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import beans.Categoria;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletConfig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import managers.LoggerManager;

/**
 *
 * @author Administrador
 */
public class ControllerServlet extends HttpServlet {

    private ArrayList<Categoria> categorias;
    
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        
        super.init(servletConfig);
        String prefix = getServletContext().getRealPath("/");
        LoggerManager.prefix = prefix;
        categorias = createCategoriasBeans();
        
        //la guardo en el scope de la aplicacion
        getServletContext().setAttribute("categorias", categorias);
    }

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userPath = request.getServletPath();
        
       // request a la pagina categoria
        if (userPath.equals("/category")) {
            // TODO: implementar la request
            
            //request.getSession().setAttribute("categoria", "categoria");
            userPath = "/category";

        // request a la pagina carrito compra
        } else if (userPath.equals("/viewCart")) {
            // TODO: implementar la request

            userPath = "/cart";

        // request a la pagina de checkout (compra)
        } else if (userPath.equals("/checkout")) {
            // TODO: Implement checkout page request
            userPath = "/checkout";
        
         
        
        } else if (userPath.equals("/tmp")) {
            // TODO: Implement checkout page request
            userPath = "/confirmation";
        
        } 

        // redirecion con RequestDispatcher a la pagina
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            getServletContext().setAttribute("view", url);
            request.getRequestDispatcher(url).forward(request, response);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String userPath = request.getServletPath();

        // accion de añadir producto al carrito
        if (userPath.equals("/addToCart")) {
            // TODO: Implementar la acion 
            
            userPath = "/category";

        //  accion de actualizar carrito 
        } else if (userPath.equals("/updateCart")) {
            // TODO: Implementar la acion
            
            userPath = "/cart";

        //  accion de comprar
        } else if (userPath.equals("/purchase")) {
            // TODO: Implementar la acion

            userPath = "/confirmation";
        }

        // redirecion con RequestDispatcher a la pagina
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    private ArrayList<Categoria> createCategoriasBeans() {

        Categoria lacteos;
        Categoria carnes;
        Categoria panaderia;
        Categoria frutasVerduras;

        lacteos = new Categoria(1, "lácteos", "lacteos.jpg");
        carnes = new Categoria(2, "carnes", "carnes.jpg");
        panaderia = new Categoria(3, "panadería", "panaderia.jpg");
        frutasVerduras = new Categoria(4, "frutas & verduras", "frutas & verduras.jpg");

        categorias = new ArrayList<Categoria>();
        categorias.add(lacteos);
        categorias.add(carnes);
        categorias.add(panaderia);
        categorias.add(frutasVerduras);

        return categorias;

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
