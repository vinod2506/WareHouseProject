package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class DocumentData {

	@Id
	private Integer fileId;
	private String filename;
	@Lob
	private byte[] fileData;

}
