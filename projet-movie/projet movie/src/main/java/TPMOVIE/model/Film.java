package TPMOVIE.model;

import io.swagger.annotations.ApiModelProperty;

public class Film {

	public Film(String titre, String Real, String acteurPrinci,String dateSorti) {
		this.titre = titre;
		this.Real = Real;
		this.acteurPrinci = acteurPrinci;
		this.dateSorti = dateSorti;
	}

	@ApiModelProperty(notes = "Film Title",name="Title",required=true,value="Title")
	private String titre;
	@ApiModelProperty(notes = "Film Maker",name="Film Maker",required=true,value="Film Maker")
	private String Real;
	@ApiModelProperty(notes = "Main Actor",name="Main Actor",required=true,value="Main actor")
	private String acteurPrinci;
	@ApiModelProperty(notes = "Film release date",name="Film release date",required=true,value="Film release date")
	private String dateSorti;

	public String gettitre() {
		return titre;
	}
	public void settitre(String titre) {
		this.titre = titre;
	}
	public String getReal() {
		return Real;
	}
	public void setReal(String Real) {
		this.Real = Real;
	}
	public String getdateSorti() {
		return dateSorti;
	}
	public void setdateSorti(String dateSorti) {
		this.dateSorti = dateSorti;
	}
	public String getActeurPrinci() {
		return acteurPrinci;
	}

	public void setActeurPrinci(String acteurPrinci) {
		this.acteurPrinci = acteurPrinci;
	}

	@Override
	public String toString() {
		return "Film [Titre=" + titre + ", Real=" + Real
				+ ", acteurPrincipal=" + acteurPrinci + ", Film sorti le =" + dateSorti  ;
	}
}
