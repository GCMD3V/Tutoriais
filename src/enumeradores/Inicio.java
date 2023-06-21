package enumeradores;

public class Inicio {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        pedido1.name = "iFood";
        pedido1.status = StatusPedidoEnum.PENDENTE;

        System.out.println(pedido1); 
        //Assim, no momento em que System.out.println(pedido1) é executado, o método toString() é chamado implicitamente e a representação personalizada
        // do objeto pedido1 é retornada como uma string e exibida no console.
        
        



    }
}