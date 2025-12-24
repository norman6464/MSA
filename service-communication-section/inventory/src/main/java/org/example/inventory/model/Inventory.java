package org.example.inventory.model;

public record Inventory(
        Long productId,
        // quantity（質量）
        Integer quantity
) {}
