package kg.BIZ.dto.request;

import lombok.Builder;

@Builder
public record MessageRequest (
        Long chatId,
        Long userId,
        String message
){
}
