package enumeradores;

public class Pedido {

    public String name;
    public StatusPedidoEnum status;

    @Override
    public String toString() {
        return String.format("Nome: %s  Status: %s", name, status);
        
    //Quando você chama System.out.println(pedido1), o método println() verifica o tipo do objeto passado como argumento. 
    //Se o tipo do objeto tiver uma implementação personalizada do método toString(), como é o caso da classe Pedido que você definiu, o método toString() 
    //é chamado automaticamente para obter a representação em string do objeto.
    }
}
