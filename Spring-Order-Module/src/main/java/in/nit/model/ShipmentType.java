package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity

public class ShipmentType {

	@NonNull
	@Id
	@GeneratedValue(generator = "sidgen")
	@GenericGenerator(name = "sidgen",strategy ="increment")
	@Column(name="shipID")
	private Integer sid;
	private String shipMode;
	private String shipCode;
	private String enableShipment;
	private String shipGrade;
	private String description;
	public ShipmentType() {
		System.out.println("ShipmentType.ShipmentType()");
	}
	
	
}
