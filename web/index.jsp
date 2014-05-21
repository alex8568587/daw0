<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>






    <div id="indexLeftColumn">
        <div id="welcomeText">
            <p>Hello! </p>
            <p>test ${initParam.categoriasImagenesPath}</p>
            
        </div>
    </div>

    <div id="indexRightColumn">
        
        <c:forEach var="categoria" items="${categorias}">
            
            <div class="categoryBox">
            <!-- pasar el id de la category en la href-->
            <a href="category?categoryId=${categoria.id}">
                <span class="categoryLabel">${categoria.id}</span>
                <span class="categoryLabelText">${categoria.nombre}</span>
                <img src="${initParam.categoriasImagenesPath}/${categoria.imagen}"
                     alt="${categoria.nombre}">
            </a>
        </div>
            
            
        </c:forEach>
        
        
        <!--div class="categoryBox">
            <a href="category">
                 <span class="categoryLabel"></span>
                <span class="categoryLabelText">Cat2</span>
            </a>
        </div>
        <div class="categoryBox">
            <a href="category">
                 <span class="categoryLabel"></span>
                <span class="categoryLabelText">Cat3</span>
            </a>
        </div>
        <div class="categoryBox">
            <a href="category">
                 <span class="categoryLabel"></span>
                <span class="categoryLabelText">Cat4</span>
            </a>
        </div-->
    </div>
    




