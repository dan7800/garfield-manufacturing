package edu.rit.se.swen343.clients;

import java.util.Arrays;
import java.util.List;

import com.mashape.unirest.http.Unirest;

public class HTTPInventoryAPIClient implements InventoryAPIClient {
	private static final String API_ROOT = "http://localhost/inventory";

	/**
	 * Generate a URL that can be used as an endpoint
	 *
	 * @param paths
	 *            the url parts to be joined with the api root
	 * @return a fully qualified url
	 */
	private String prepareUrlForRequest(String... paths) {
		List<String> parts = Arrays.asList(paths);
		parts.add(0, API_ROOT);

		return String.join("/", parts);
	}

	@Override
	public int getKeyboards() throws Exception {
		String url = prepareUrlForRequest("product-stock", "keyboard");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public int getTouchScreens() throws Exception {
		String url = prepareUrlForRequest("product-stock", "touch-screens");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public int getBaseProcessors() throws Exception {
		String url = prepareUrlForRequest("product-stock", "base-processors");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public int getFastProcessors() throws Exception {
		String url = prepareUrlForRequest("product-stock", "fast-processors");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public int get16GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "16gb-memory");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public int get32GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "32gb-memory");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public int get64GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "64gb-memory");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public int get128GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "128gb-memory");

		String response = Unirest.get(url).asString().getBody();

		return Integer.parseInt(response);
	}

	@Override
	public boolean decrementKeyboards() throws Exception {
		String url = prepareUrlForRequest("product-stock", "keyboard", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

	@Override
	public boolean decrementTouchScreens() throws Exception {
		String url = prepareUrlForRequest("product-stock", "touch-screens", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

	@Override
	public boolean decrementBaseProcessors() throws Exception {
		String url = prepareUrlForRequest("product-stock", "base-processors", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

	@Override
	public boolean decrementFastProcessors() throws Exception {
		String url = prepareUrlForRequest("product-stock", "fast-processors", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

	@Override
	public boolean decrement16GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "16gb-memory", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

	@Override
	public boolean decrement32GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "32gb-memory", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

	@Override
	public boolean decrement64GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "64gb-memory", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

	@Override
	public boolean decrement128GBMemory() throws Exception {
		String url = prepareUrlForRequest("product-stock", "128gb-memory", "decrement");
		
		int response = Unirest.post(url).asBinary().getStatus();
		
		return response == 200;
	}

}
