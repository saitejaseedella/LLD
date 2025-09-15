package parking_lot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import parking_lot.models.Ticket;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}
