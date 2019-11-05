package sqycanada.elastic.bean;

import java.util.Map;

import org.springframework.data.geo.Point;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LocationMaster {
	public Map addr_comp;
	public String name;
	public String loc_type;
	public Map treb_query;
	public String source;
	public Map alias;
	public Point coordinates;
	public Double lat;
	public Double lng;
	public Map bounds;
	public String url;
	public Map breadcrumb;
	public int in_suggestion;
	public int loc_weightage;
	public Map getAddr_comp() {
		return addr_comp;
	}
	public void setAddr_comp(Map addr_comp) {
		this.addr_comp = addr_comp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc_type() {
		return loc_type;
	}
	public void setLoc_type(String loc_type) {
		this.loc_type = loc_type;
	}
	public Map getTreb_query() {
		return treb_query;
	}
	public void setTreb_query(Map treb_query) {
		this.treb_query = treb_query;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Map getAlias() {
		return alias;
	}
	public void setAlias(Map alias) {
		this.alias = alias;
	}
	public Point getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Point coordinates) {
		this.coordinates = coordinates;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public Map getBounds() {
		return bounds;
	}
	public void setBounds(Map bounds) {
		this.bounds = bounds;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Map getBreadcrumb() {
		return breadcrumb;
	}
	public void setBreadcrumb(Map breadcrumb) {
		this.breadcrumb = breadcrumb;
	}
	public int getIn_suggestion() {
		return in_suggestion;
	}
	public void setIn_suggestion(int in_suggestion) {
		this.in_suggestion = in_suggestion;
	}
	public int getLoc_weightage() {
		return loc_weightage;
	}
	public void setLoc_weightage(int loc_weightage) {
		this.loc_weightage = loc_weightage;
	}
	
}
