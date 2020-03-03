package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UomType {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer uomId;
	
	public UomType(Integer uomId) {
		super();
		this.uomId = uomId;
	}
	private String uomType;
	private String uomModel;
	private String uomDesc;

}
