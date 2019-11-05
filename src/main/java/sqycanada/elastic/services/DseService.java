package sqycanada.elastic.services;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.util.EntityUtils;import org.apache.lucene.queryparser.xml.builders.BooleanQueryBuilder;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.common.unit.DistanceUnit;
import org.springframework.stereotype.Repository;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.query.GeoBoundingBoxQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryBuilders.*;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import sqycanada.elastic.bean.LocationMaster;
import sqycanada.elastic.config.TransportClientConfig;

@Repository
public class DseService {

    private final String INDEX1 = "locationmaster";
    private final String INDEX2 = "ca_project";
    private final String TYPE1 = "Location";
    private final String TYPE2 = "Property";

    private RestHighLevelClient restHighLevelClient;
    private TransportClient transportClient;

    private ObjectMapper objectMapper;

    public DseService( ObjectMapper objectMapper, TransportClientConfig transportClient,RestHighLevelClient restHighLevelClient) {
        this.objectMapper = objectMapper;
        this.restHighLevelClient = restHighLevelClient;
        this.transportClient = transportClient.getClient();
    }
    /*
     * This fucntion is repsonsible for gives result by uri
     */
    public Map<String, Object> searchByUri(String id){
        GetRequest getRequest = new GetRequest(INDEX1, TYPE1, id);
        Map<String, Object> sourceAsMap=null;
        try {
            GetResponse getResponse1 = restHighLevelClient.get(getRequest, RequestOptions.DEFAULT);
             sourceAsMap = getResponse1.getSourceAsMap();
            return sourceAsMap;
        } catch (java.io.IOException e){
            e.getLocalizedMessage();
        }
        return sourceAsMap;
    }
    /*
     * This function return data by elastic id
     */
    public Map<String, Object> searchById(String id){
        GetRequest getRequest = new GetRequest(INDEX1, TYPE1, id);
        Map<String, Object> sourceAsMap=null;
        try {
            GetResponse getResponse1 = restHighLevelClient.get(getRequest, RequestOptions.DEFAULT);
             sourceAsMap = getResponse1.getSourceAsMap();
            return sourceAsMap;
        } catch (java.io.IOException e){
            e.getLocalizedMessage();
        }
    	
        return sourceAsMap;
    }
    //match query
    public SearchHits searchByUrl(String filterparam){
    	SearchResponse response = transportClient.prepareSearch(INDEX1,INDEX2)
    	        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
    	        .setQuery(QueryBuilders.matchQuery("url.keyword", filterparam))
    	        .get();
    	SearchHits sourceAsMap=null;
        sourceAsMap = response.getHits();
		return sourceAsMap;
    }
    // bbox query
    public SearchHits searchByBBox(String filterparam){
    	SearchResponse response = transportClient.prepareSearch(INDEX1)
    	        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
    	        .setQuery(QueryBuilders.geoBoundingBoxQuery("coordinates").setCorners(31.8, 30.5, 28.3, 32.12))//
    	        .get();
    	SearchHits sourceAsMap=null;
        sourceAsMap = response.getHits();
		return sourceAsMap;
    }
    //distance query
    public SearchHits searchByByDistance(String filterparam){
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
  //polygon query
    public SearchHits searchByByPolyGon(String filterparam){
    	List<GeoPoint> allPoints = new ArrayList<GeoPoint>(); 
    	allPoints.add(new GeoPoint(22.733, 68.859)); 
    	allPoints.add(new GeoPoint(24.733, 68.859)); 
    	allPoints.add(new GeoPoint(23, 70.859));
    	SearchResponse response = transportClient.prepareSearch(INDEX1)
    	        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
    	        .setQuery(QueryBuilders.matchQuery("url.keyword", filterparam))
//    	        .setQuery(QueryBuilders.geoPolygonQuery("coordinates", allPoints)
                 .get();
    	SearchHits sourceAsMap=null;
        sourceAsMap = response.getHits();
		return sourceAsMap;
    }
}
