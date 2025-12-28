.class public final LZ/p;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LZ/p;->a:I

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 1

    iget v0, p0, LZ/p;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer"

    invoke-static {p1, v0}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lo0/H0;

    iget-object p1, p1, Lo0/H0;->h:Lo0/r0;

    invoke-virtual {p1}, Lo0/r0;->b()Landroid/graphics/Outline;

    move-result-object p1

    invoke-static {p1}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->set(Landroid/graphics/Outline;)V

    return-void

    :pswitch_0
    instance-of v0, p1, LZ/q;

    if-eqz v0, :cond_0

    check-cast p1, LZ/q;

    iget-object p1, p1, LZ/q;->h:Landroid/graphics/Outline;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->set(Landroid/graphics/Outline;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
