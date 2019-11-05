package sqycanada.elastic.controller;
import sqycanada.elastic.services.DseService;
import sqycanada.elastic.bean.LocationMaster;

import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

@Controller
public class DseController {

    private DseService dseService;

    public DseController(DseService dseservice) {
        this.dseService = dseservice;
    }

    @GetMapping(value= {"/{type}/**","/{type}/**"})
    @ResponseBody
    public ResponseEntity searchByLOcation(@PathVariable String type,HttpServletRequest request ,@RequestParam Map<String,String> allRequestParams){
    	String url=request.getRequestURI();
    	String urlsegment = url.replace("/sale/","").replace("/lease/", "");
        SearchHits data=dseService.searchByUrl(urlsegment); 
         Map<String, Object>result=new HashMap<String, Object>();
        for(SearchHit hit : data.getHits()) {
            result=hit.getSourceAsMap();
        }
        
        return new ResponseEntity<>(result,HttpStatus.OK);
    }
}
