<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


   


    


            <div id="categoryLeftColumn">
                <div class="categoryButton" id="selectedCategory">
                    <span class="categoryText">Cat 1  ${categoria.nombre}</span>
                </div>

                <a href="category" class="categoryButton">
                    <span class="categoryText">Cat 2</span>
                </a>

                <a href="category" class="categoryButton">
                    <span class="categoryText">Cat 3</span>
                </a>

                <a href="category" class="categoryButton">
                    <span class="categoryText">Cat 4</span>
                </a>
            </div>

            <div id="categoryRightColumn">
                <p id="categoryTitle">[ categoria selecionada ]</p>

                <table id="productTable">
                    <tr>
                        <td class="lightBlue">
                            <img src="#" alt="product image">
                        </td>
                        <td class="lightBlue">
                            [ nombre producto  ]
                            <br>
                            <span class="smallText">[ descripcion producto  ]</span>
                        </td>
                        <td class="lightBlue">[ precio ]</td>
                        <td class="lightBlue">
                            <form action="addToCart" method="post">
                                <input type="submit" value="comprar">
                            </form>
                        </td>
                    </tr>

                    <tr>
                        <td class="white">
                            <img src="#" alt="product image">
                        </td>
                        <td class="white">
                            [ nombre producto ]
                            <br>
                            <span class="smallText">[ descripcion producto ]</span>
                        </td>
                        <td class="white">[ precio ]</td>
                        <td class="white">
                            <form action="addToCart" method="post">
                                <input type="submit" value="comprar">
                            </form>
                        </td>
                    </tr>

                    <tr>
                        <td class="lightBlue">
                            <img src="#" alt="product image">
                        </td>
                        <td class="lightBlue">
                            [ nombre producto ]
                            <br>
                            <span class="smallText">[ descripcion producto ]</span>
                        </td>
                        <td class="lightBlue">[ precio ]</td>
                        <td class="lightBlue">
                            <form action="addToCart" method="post">
                                <input type="submit" value="comprar">
                            </form>
                        </td>
                    </tr>

                    <tr>
                        <td class="white">
                            <img src="#" alt="product image">
                        </td>
                        <td class="white">
                            [ nombre producto ]
                            <br>
                            <span class="smallText">[ descripcion producto ]</span>
                        </td>
                        <td class="white">[ precio ]</td>
                        <td class="white">
                            <form action="addToCart" method="post">
                                <input type="submit" value="Comprar">
                            </form>
                        </td>
                    </tr>
                </table>
            </div>
    

         