package br.com.empresa.movimentomanual.util;

import org.springframework.data.domain.Page;

import br.com.empresa.movimentomanual.model.MovimentoManual;

public class Pager {

	private final Page<MovimentoManual> movimentoManuals;

    public Pager(Page<MovimentoManual> produtos) {
        this.movimentoManuals = produtos;
    }

    public int getPageIndex() {
        return movimentoManuals.getNumber() + 1;
    }

    public int getPageSize() {
        return movimentoManuals.getSize();
    }

    public boolean hasNext() {
        return movimentoManuals.hasNext();
    }

    public boolean hasPrevious() {
        return movimentoManuals.hasPrevious();
    }

    public int getTotalPages() {
        return movimentoManuals.getTotalPages();
    }

    public long getTotalElements() {
		return movimentoManuals.getTotalElements();
    }

    public boolean indexOutOfBounds() {
        return this.getPageIndex() < 0 || this.getPageIndex() > this.getTotalElements();
    }

}