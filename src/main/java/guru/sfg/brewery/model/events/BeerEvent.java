package guru.sfg.brewery.model.events;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerEvent implements Serializable
{
    public static final long serialVersionUID = 2374681110115278426L;

    private BeerDto beerDto;
}
