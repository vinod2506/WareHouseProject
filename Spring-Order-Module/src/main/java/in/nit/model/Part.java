package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name="PartTab")
public class Part {

	@Id
	@NonNull
	@GeneratedValue
	private Integer pid;
	private String code;
	private String width;
	private String length;
	private String height;
	private String baseCost;
	private String baseCurrency;
	@ManyToOne
	@JoinColumn(name = "uomFk")
	private UomType uom;
	@ManyToOne
	@JoinTable(name="oderfk")
	private OrderType odr;
	private String descp;

}
