package in.nit.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;



@Entity
@Table(name="OrderTab")
@Data
@RequiredArgsConstructor
public class OrderType {

	

	@Id
	@GeneratedValue

	private Integer oid;
	
	public OrderType(Integer oid) {
		super();
		this.oid = oid;
	}

	private String odrMode;
	private String odrCode;
	@Column(name="methods")
	private String odrMethod;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="OrderAccept",joinColumns = @JoinColumn(name="oid"))
	@OrderColumn(name="pos")
	@Column(name="OrderAccept")
	private List<String> odrAccept; 

	private String odrDescp;
	
}
