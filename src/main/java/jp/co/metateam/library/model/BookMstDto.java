package jp.co.metateam.library.model;

import java.sql.Timestamp;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * 書籍マスタDTO
 */
@Getter
@Setter
public class BookMstDto {
    
    private Long id;

    @NotBlank(message = "ISBNは必須項目です")
    @Pattern(regexp = "\\d{13}", message = "ISBNは13桁の半角数字で入力してください")
    private String isbn;

    @NotBlank(message = "書籍名は必須項目です")
    @Size(max = 255, message = "書籍名は255文字以内で入力してください")
    private String title;

    private Timestamp deletedAt;
}