package com.yungnickyoung.minecraft.paxi.mixin;

import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.server.packs.repository.RepositorySource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Set;

@Mixin(PackRepository.class)
public interface PackRepositoryAccessor {
    @Accessor
    Set<RepositorySource> getSources();

    @Mutable
    @Accessor
    void setSources(Set<RepositorySource> sources);
}
