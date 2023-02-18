//LUIS DURAN FLORES - 177406
public class StackYQueue {

	
	public void invertirCadena(String string) {
		String[] nueva = string.split("");
		NewStack uno = new NewStack(nueva.length);
		int contador = 0;
		for(int i = nueva.length-1; i >= 0; i--) {
			uno.push(string.charAt(i));
			System.out.print(uno.stack[contador]);
			contador++;
		}
		
	}
	
	public void esPalindromo(String myString) {
		String newString = myString.replace(" ", "");
		String[] stringFinal = newString.split("");
		NewStack one = new NewStack(stringFinal.length);
		for(int i = stringFinal.length-1; i >= 0; i--) {
			one.push(myString.charAt(i));
		}
		String invert = String.valueOf(one.stack);
		if(invert.equals(newString)) {
			System.out.println("Su cadena SI es un palíndromo");
		} else {
			System.out.println("Su cadena NO es un palíndromo");
		}
    }
}