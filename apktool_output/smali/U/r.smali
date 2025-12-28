.class public final LU/r;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LU/q;


# direct methods
.method public synthetic constructor <init>(LU/q;I)V
    .locals 0

    iput p2, p0, LU/r;->e:I

    iput-object p1, p0, LU/r;->f:LU/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LU/r;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/r;->f:LU/q;

    iget-object v1, v0, LP/k;->d:LP/k;

    iget-boolean v1, v1, LP/k;->p:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, LU/c;->A(LU/q;)V

    :cond_0
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LU/r;->f:LU/q;

    invoke-virtual {v0}, LU/q;->f0()LU/j;

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
