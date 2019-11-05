package sqycanada.elastic.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.core.net.server.Client;
@Configuration

public class TransportClientConfig {
	@Value("${spring.data.elasticsearch.cluster-nodes}")
    private String clusterNodes;
    @Value("${spring.data.elasticsearch.cluster-name}")
    private String clusterName;
	
	@Bean
	public TransportClient getClient()
	{
		TransportClient client=null;
		try {
			 client = new PreBuiltTransportClient(
					  Settings.builder().put("client.transport.sniff", true)
					                    .put("cluster.name",clusterName).build()) 
					 .addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));

			// on shutdown
			
		} catch (UnknownHostException e) {
						e.printStackTrace();
		}
		return (TransportClient) client;
	}
}
