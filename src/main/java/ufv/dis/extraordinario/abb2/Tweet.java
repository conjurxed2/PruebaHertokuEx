package ufv.dis.extraordinario.abb2;

import java.sql.Date;

import org.ocpsoft.prettytime.PrettyTime;

public class Tweet {
		
		private String nombre;
		private String mensaje;
		
		
		public Tweet(String nombre, String mensaje) {
			super();
			this.nombre = nombre;
			this.mensaje = mensaje;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getMensaje() {
			return mensaje;
		}
		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		public void datetime() {
			
			PrettyTime p = new PrettyTime();
			System.out.println(p.format(new Date(System.currentTimeMillis())));
			
			System.out.println(p.format(new Date(System.currentTimeMillis() + 1000*60*10)));
		}
		
		public static boolean isMesage(String mensaje) {
			return mensaje.length()<141;
		}
		
}
