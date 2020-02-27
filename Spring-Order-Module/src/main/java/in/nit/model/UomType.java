package in.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UomType {

	
	private Integer uomId;
	private String uomType;
	private String uomMethod;
	private String uomDesc;

}
