package com.generationg1.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
	@Entity
	@Table(name="leones")
public class Leon {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

		@NotNull()
		@Size(min=3, max=50)
		private String color;
	
		@Size(min=1,max=1)
		private String sexo;
	
		private Integer edad;

		public Leon() {
			super();
		}

		public Leon(Long id, @Size(min = 3, max = 50) String color, @NotNull @Size(max = 1) @Size(min = 1, max = 1) String sexo,
				@Size(min = 1, max = 2) Integer edad) {
			super();
			this.id = id;
			this.color = color;
			this.sexo = sexo;
			this.edad = edad;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(@Size(min = 1, max = 1) String sexo) {
			this.sexo = sexo;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			this.edad = edad;
		}
	

}
