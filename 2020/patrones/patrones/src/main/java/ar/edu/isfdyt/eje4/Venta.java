package ar.edu.isfdyt.eje4;

public class Venta {

		private FormaPago formaPago;
	
		public FormaPago getFormaPago() {
			return formaPago;
		}
	
		public void setFormaPago(FormaPago formaPago) {
			this.formaPago = formaPago;
		}
		
		public void cobrar() {
			formaPago.pagar(calcularPrecioaPagar());
		}
	
		private float calcularPrecioaPagar() {
			return 0;
		}
		
		public static void main(String[] args) {
			FormaPago formaPago = new Credito("Banco Provincia VISA", "123456", "123");
			
			Venta v = new Venta();
			v.setFormaPago(formaPago);
			
			formaPago = new Transferencia("12345678903");
			v.setFormaPago(formaPago);

			v.cobrar();
		}
	
}
