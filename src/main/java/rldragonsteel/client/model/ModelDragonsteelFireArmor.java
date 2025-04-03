package rldragonsteel.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

public class ModelDragonsteelFireArmor extends ModelBiped {
    public ModelRenderer visor1;
    public ModelRenderer HornR;
    public ModelRenderer HornR4;
    public ModelRenderer HornL;
    public ModelRenderer HornL4;
    public ModelRenderer visor2;
    public ModelRenderer HornR2;
    public ModelRenderer HornR3;
    public ModelRenderer HornR5;
    public ModelRenderer HornL2;
    public ModelRenderer HornL3;
    public ModelRenderer HornL5;
    public ModelRenderer sleeveRight;
    public ModelRenderer robeLowerLeft;
    public ModelRenderer sleeveLeft;
    public ModelRenderer robeLowerRight;

    public ModelDragonsteelFireArmor(float modelSize) {
        super(modelSize, 0, 64, 64);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.HornL4 = new ModelRenderer(this, 9, 38);
        this.HornL4.setRotationPoint(3.2F, -7.4F, -3.0F);
        this.HornL4.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 5, modelSize);
        this.setRotateAngle(HornL4, -0.14713125594312196F, 0.296705972839036F, 0.0F);
        this.HornL5 = new ModelRenderer(this, 25, 45);
        this.HornL5.setRotationPoint(0.0F, -0.1F, 4.3F);
        this.HornL5.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 3, modelSize);
        this.setRotateAngle(HornL5, 0.3649483465920143F, 0.0F, 0.0F);
        this.HornL = new ModelRenderer(this, 9, 39);
        this.HornL.setRotationPoint(2.5F, -7.9F, -4.2F);
        this.HornL.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 4, modelSize);
        this.setRotateAngle(HornL, 0.43022366061660217F, 0.15707963267948966F, 0.0F);
        this.HornL3 = new ModelRenderer(this, 24, 44);
        this.HornL3.setRotationPoint(0.0F, -0.1F, 4.3F);
        this.HornL3.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 4, modelSize);
        this.setRotateAngle(HornL3, 0.5918411493512771F, 0.0F, 0.0F);
        this.visor2 = new ModelRenderer(this, 27, 50);
        this.visor2.mirror = true;
        this.visor2.setRotationPoint(-0.1F, 9.0F, 0.2F);
        this.visor2.addBox(0.8F, -13.3F, -4.9F, 4, 5, 8, modelSize);
        this.HornR3 = new ModelRenderer(this, 24, 44);
        this.HornR3.mirror = true;
        this.HornR3.setRotationPoint(0.0F, -0.1F, 4.3F);
        this.HornR3.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 4, modelSize);
        this.setRotateAngle(HornR3, 0.5918411493512771F, 0.0F, 0.0F);
        this.HornL2 = new ModelRenderer(this, 9, 38);
        this.HornL2.setRotationPoint(0.0F, 0.3F, 3.6F);
        this.HornL2.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 5, modelSize);
        this.setRotateAngle(HornL2, -0.3391174736624982F, 0.0F, 0.0F);
        this.sleeveRight = new ModelRenderer(this, 36, 33);
        this.sleeveRight.setRotationPoint(0.3F, -0.3F, 0.0F);
        this.sleeveRight.addBox(-4.5F, -2.1F, -2.4F, 5, 6, 5, modelSize);
        this.setRotateAngle(sleeveRight, 0.0F, 0.0F, -0.12217304763960307F);
        this.HornR5 = new ModelRenderer(this, 25, 45);
        this.HornR5.mirror = true;
        this.HornR5.setRotationPoint(0.0F, -0.1F, 4.3F);
        this.HornR5.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 3, modelSize);
        this.setRotateAngle(HornR5, 0.3649483465920143F, 0.0F, 0.0F);
        this.robeLowerRight = new ModelRenderer(this, 4, 51);
        this.robeLowerRight.mirror = true;
        this.robeLowerRight.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.robeLowerRight.addBox(-2.1F, 0.0F, -2.5F, 4, 7, 5, modelSize);
        this.robeLowerLeft = new ModelRenderer(this, 4, 51);
        this.robeLowerLeft.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.robeLowerLeft.addBox(-1.9F, 0.0F, -2.5F, 4, 7, 5, modelSize);
        this.visor1 = new ModelRenderer(this, 27, 50);
        this.visor1.setRotationPoint(0.0F, 9.0F, 0.2F);
        this.visor1.addBox(-4.7F, -13.3F, -4.9F, 4, 5, 8, modelSize);
        this.HornR = new ModelRenderer(this, 9, 39);
        this.HornR.setRotationPoint(-2.5F, -7.9F, -4.2F);
        this.HornR.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 4, modelSize);
        this.setRotateAngle(HornR, 0.43022366061660217F, -0.15707963267948966F, 0.0F);
        this.HornR4 = new ModelRenderer(this, 9, 38);
        this.HornR4.setRotationPoint(-3.2F, -7.4F, -3.0F);
        this.HornR4.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 5, modelSize);
        this.setRotateAngle(HornR4, -0.14713125594312196F, -0.296705972839036F, 0.0F);
        this.sleeveLeft = new ModelRenderer(this, 36, 33);
        this.sleeveLeft.mirror = true;
        this.sleeveLeft.setRotationPoint(-0.7F, -0.3F, 0.0F);
        this.sleeveLeft.addBox(-0.5F, -2.1F, -2.4F, 5, 6, 5, modelSize);
        this.setRotateAngle(sleeveLeft, 0.0F, 0.0F, 0.12217304763960307F);
        this.HornR2 = new ModelRenderer(this, 9, 38);
        this.HornR2.setRotationPoint(0.0F, 0.3F, 3.6F);
        this.HornR2.addBox(-1.0F, -0.8F, 0.0F, 2, 2, 5, modelSize);
        this.setRotateAngle(HornR2, -0.3391174736624982F, 0.0F, 0.0F);
        this.bipedHead.addChild(this.HornL4);
        this.HornL4.addChild(this.HornL5);
        this.bipedHead.addChild(this.HornL);
        this.HornL2.addChild(this.HornL3);
        this.bipedHead.addChild(this.visor2);
        this.HornR2.addChild(this.HornR3);
        this.HornL.addChild(this.HornL2);
        this.bipedRightArm.addChild(this.sleeveRight);
        this.HornR4.addChild(this.HornR5);
        this.bipedRightLeg.addChild(this.robeLowerRight);
        this.bipedLeftLeg.addChild(this.robeLowerLeft);
        this.bipedHead.addChild(this.visor1);
        this.bipedHead.addChild(this.HornR);
        this.bipedHead.addChild(this.HornR4);
        this.bipedLeftArm.addChild(this.sleeveLeft);
        this.HornR.addChild(this.HornR2);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        if (entityIn instanceof EntityArmorStand) {
            EntityArmorStand entityarmorstand = (EntityArmorStand) entityIn;
            this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
            this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
            this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
            this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
            this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
            this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
            this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
            this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
            this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
            this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
            this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
            this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
            this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
            this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
            this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
            this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
            this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
            this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
            this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
            this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
            this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
            copyModelAngles(this.bipedHead, this.bipedHeadwear);
        } else {
            super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        }
    }
}