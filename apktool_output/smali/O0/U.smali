.class public final Lo0/U;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lo0/U;->a:I

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lo0/U;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Lo0/W;

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, LZ0/d;->p(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo0/W;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    iget-object v1, v0, Lo0/W;->o:LD/h0;

    invoke-static {v0, v1}, LZ0/d;->K(Lg2/g;Lg2/i;)Lg2/i;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no Looper on this thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
