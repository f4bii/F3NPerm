package nexus.slime.f3nperm.provider;

import nexus.slime.f3nperm.reflection.ReflectionException;
import nexus.slime.f3nperm.reflection.Reflections;

public class ReflectionProvider_1_21_3 extends ReflectionProvider_1_20_5 {

    @Override
    public Object makeStatusPacket(Object entityPlayer, byte status) throws ReflectionException {
        return Reflections.make("net.minecraft.network.protocol.game.ClientboundEntityEventPacket(net.minecraft.world.entity.Entity,byte)", entityPlayer, status);
    }

    @Override
    public boolean isStatusPacket(Object packet) throws ReflectionException {
        return Reflections.resolve("net.minecraft.network.protocol.game.ClientboundEntityEventPacket").isInstance(packet);
    }

    @Override
    public Object getPlayerConnection(Object entityPlayer) throws ReflectionException {
        return Reflections.get(entityPlayer, "f");
    }
}
