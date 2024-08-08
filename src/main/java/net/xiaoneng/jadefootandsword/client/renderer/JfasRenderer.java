
package net.xiaoneng.jadefootandsword.client.renderer;

import net.xiaoneng.jadefootandsword.procedures.JfasXianShiTiaoJianProcedure;
import net.xiaoneng.jadefootandsword.entity.JfasEntity;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JfasRenderer extends HumanoidMobRenderer<JfasEntity, HumanoidModel<JfasEntity>> {
	public JfasRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<JfasEntity, HumanoidModel<JfasEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("jade_foot_and_sword:textures/entities/gan_cheng_xin_yi_fu_nen_tui_temp.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, JfasEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (JfasXianShiTiaoJianProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(JfasEntity entity) {
		return new ResourceLocation("jade_foot_and_sword:textures/entities/gan_cheng_xin_yi_nen_tui_.png");
	}
}
