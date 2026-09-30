package br.com.hanrry.spring_boot_essentials.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {
        private String nome;
        private BigDecimal preco;
        private Integer quantidade;
}