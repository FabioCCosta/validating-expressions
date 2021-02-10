package code;
import java.util.Stack;

public class ExpressionImpl {
	
	public boolean isValidOperators(String s) {
		
		if(s.isBlank()) return false;
		
		Stack<Character> pilha = new Stack<Character>();
		
		for(char value : s.toCharArray()) {
			if(value == '(' || value == '[' || value == '{') {
				pilha.push(value);
				
				switch(value) {
					
					case '[':
						
						if(pilha.search('(') == 2) return false;
						break;
						
					case '{':
						
						if(pilha.search('(') == 2 || pilha.search('[') == 2) return false;
						break;

				}
			}
			
			
			switch(value) {
				case ')':
					if(pilha.empty()) return false;
					if(pilha.pop() != '(') return false;
					break;
					
				case ']':
					if(pilha.empty()) return false;
					if(pilha.pop() != '[') return false;
					break;
					
				case '}':
					if(pilha.empty()) return false;
					if(pilha.pop() != '{') return false;
					break;
			}	
				
		}
		
	// se a pilha estiver vazia ent�o todos os operadores foram fechados
		return pilha.empty();
	}
	
	
} 
	
