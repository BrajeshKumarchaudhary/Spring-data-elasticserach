package sqycanada.elastic.services;

import java.util.HashMap;
import java.util.Map;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHits;
import org.springframework.stereotype.Component;

@Component
public class DseFilterService  {
	private TransportClient transportClient;
	  private final String INDEX1 = "locationmaster";
	  private final String INDEX2 = "ca_project";
	  private final String TYPE1 = "Location";
	  private final String TYPE2 = "Property";
	public DseFilterService(TransportClient transportClient) {
		this.transportClient = transportClient;
	}
	public SearchHits getFilterData(String filterparam){
    	Map<String ,String> match=new HashMap<String,String>();
    	SearchResponse response = transportClient.prepareSearch(INDEX1)
    	        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
    	        .setQuery(QueryBuilders.matchQuery("url.keyword", filterparam))
    	        .setQuery(QueryBuilders.geoDistanceQuery("coordinates").point(29.976, 31.131).distance(10, DistanceUnit.MILES))
    	        .get();
    	SearchHits sourceAsMap=null;
        sourceAsMap = response.getHits();
		return sourceAsMap;
    }
}
