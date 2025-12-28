.class public final La1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, La1/k;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Ld1/X;LB2/i;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, La1/k;->d:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/k;->e:Ljava/lang/Object;

    iput-object p3, p0, La1/k;->f:Ljava/lang/Object;

    iput-object p4, p0, La1/k;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, La1/k;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La1/k;->f:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v1, p0, La1/k;->e:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Ld1/T;->h(Landroid/view/View;LB2/i;)V

    iget-object v0, p0, La1/k;->g:Ljava/lang/Object;

    check-cast v0, Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :pswitch_0
    :try_start_0
    iget-object v0, p0, La1/k;->e:Ljava/lang/Object;

    check-cast v0, La1/d;

    invoke-virtual {v0}, La1/d;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, LD2/h;

    iget-object v2, p0, La1/k;->f:Ljava/lang/Object;

    check-cast v2, La1/e;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v0, v4}, LD2/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    iget-object v0, p0, La1/k;->g:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
