import controllers.*;

import views.View;

public class App {
    public static void main(String[] args) throws Exception {
        
        /// CREAR LA VISTA
        View vista = new View();

        /// CREAR LAS CLASES CON LOS METODOS DE ORDENAMIENTO Y BUSQUEDA
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        /// CREAR EL CONTROLADOR
        Controller controller = new Controller(vista, sortingMethods, searchMethods);

        /// INICIAR LA APLICACIÓN
        
    }
}
