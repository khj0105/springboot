package com.example.korea_sleepTech_springboot.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
// @NoArgsConstructor
@AllArgsConstructor
public class CommentResponseDto {
    // 선택 매개변수
//    @Builder.Default
//    private Long id = 0L;
//    @Builder.Default
//    private Long postId = 0L;

    private Long id;
    private Long postId;

    // 필수 매개변수
    private final String content;
    private final String commenter;

    public static class Builder {
        private Long id;
        private Long postId;

        // 필수 매개변수
        private final String content;
        private final String commenter;

        public Builder(String content, String commenter) {
            this.content = content;
            this.commenter = commenter;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder postId(Long postId) {
            this.postId = postId;
            return this;
        }

        public CommentResponseDto build() {
            return new CommentResponseDto(id, postId, content, commenter);
        }
    }
}