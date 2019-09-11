import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LAb7 {

	
	public static void main(String args[])
	{
		
		
		
		String fileName = "C:\\Users\\Suman.Ghosh\\workspace\\Stream\\src\\places2.txt";
		Path path = Paths.get(fileName);
		
		
		
	
			try {
				List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
				
				 List<Place> places=allLines.stream().skip(1)
		        .map(line -> {
	                
	                return new Place(allLines.get(0),
	                		allLines.get(1),
	                		allLines.get(2)                               
	                                  );
	            })
	        .collect(Collectors.toList());
				 
				
				 
				 Map<Object, List<Place>> grouped= allLines.stream().skip(1).map(line -> {
		                
		                return new Place(allLines.get(0),allLines.get(1),allLines.get(2));
		            }).collect(Collectors.groupingBy(x->x.getName()));
				 
				 
				 grouped
			        .entrySet()
			        .stream()
			        .forEach(System.out::println);
				 
	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
			
		
		
		
		
	
		
	}
}



class Place {
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGeonameid() {
		return geonameid;
	}
	public void setGeonameid(String geonameid) {
		this.geonameid = geonameid;
	}
	public Place(String name, String state, String geonameid) {
		super();
		this.name = name;
		this.state = state;
		this.geonameid = geonameid;
	}
	private String name;
    private String state;
    private String geonameid;
   
}