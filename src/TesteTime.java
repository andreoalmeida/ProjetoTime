
public class TesteTime {

	private int h,m,s;

	public TesteTime(int h, int m, int s) {

		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public String exibirHoraUniversal(){
		
		return (this.h+":"+this.m+":"+this.s);
	}
	
	public String exibirHoraPadrao() {
		if(this.h == 12 && this.m == 0 && this.s == 0) {
			
			return ("12:00:00 PM");
		}
		else {
			if(this.h == 0 && this.m == 0 && this.s == 0) {
				
				return ("12:00:00 AM");
			}
			else {
				if(this.h == 12) {
					
					return (this.h+":"+this.m+":"+this.s+" PM");
				}
				else {
					if(this.h>12) {
					
						this.h=this.h-12;
						return (this.h+":"+this.m+":"+this.s+" PM");
					}
					else {
					
						return (this.h+":"+this.m+":"+this.s+" AM");
					}
				}
			}
		}
	}
}
