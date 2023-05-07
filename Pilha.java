package exercicio07;

public class Pilha implements TAD_Pilha {
	private int topo;	
	private int MAX;	
	private Object memo[];	

	
	public Pilha()
	{
		topo = -1;
		MAX = 30;
		memo = new Object[MAX];
	}

        
	public Pilha(int qtde)
	{
		topo = -1;
		MAX = qtde;
		memo = new Object[MAX];
	}

	
	public boolean isEmpty()
	{
		return(topo==-1);
	}

	
	public boolean isFull()
	{
		return(topo==MAX-1);
	}

	
	public Object push(Object x) {
		if( !isFull() && x != null ) {
			memo[++topo]=x;
			return x;
		}
                else return null;
	}

        
	
	public Object top() {
            if(!isEmpty()) return memo[topo];
                           else return null;
	}
        

	
	public String toString () {
		if(!isEmpty()) {
			String msg = "";
			for(int i=0; i<=topo; i++) {
			  msg += memo[i].toString();
                          if(i != topo) msg += ", ";
			}
			return ("P: [ " + msg + " ]");
		}
                else return "Pilha Vazia!";
	}

	
	public Object pop() {
            if(!isEmpty()) return memo[topo--];
            else return null;
	}


}
