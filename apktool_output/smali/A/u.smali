.class public final LA/u;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LA/v;


# direct methods
.method public synthetic constructor <init>(LA/v;I)V
    .locals 0

    iput p2, p0, LA/u;->e:I

    iput-object p1, p0, LA/u;->f:LA/v;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    iget-object v1, p0, LA/u;->f:LA/v;

    iget v2, p0, LA/u;->e:I

    packed-switch v2, :pswitch_data_0

    sget-object v2, LA/D;->b:LD/H;

    invoke-static {v1, v2}, Ln0/C;->h(Ln0/g;LD/k0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA/B;

    if-nez v2, :cond_0

    iget-object v0, v1, LA/v;->w:Lz/w;

    if-eqz v0, :cond_2

    invoke-virtual {v1, v0}, Ln0/i;->g0(Ln0/h;)V

    goto :goto_1

    :cond_0
    iget-object v2, v1, LA/v;->w:Lz/w;

    if-nez v2, :cond_2

    new-instance v7, LA/t;

    invoke-direct {v7, v0, v1}, LA/t;-><init>(ILjava/lang/Object;)V

    new-instance v8, LA/u;

    invoke-direct {v8, v1, v0}, LA/u;-><init>(LA/v;I)V

    sget-object v0, Lz/u;->a:Lp/G;

    sget-boolean v0, Lz/A;->a:Z

    iget-object v4, v1, LA/v;->s:Ls/g;

    iget-boolean v5, v1, LA/v;->t:Z

    iget v6, v1, LA/v;->u:F

    if-eqz v0, :cond_1

    new-instance v0, Lz/d;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lz/d;-><init>(Ls/g;ZFLA/t;LA/u;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lz/b;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lz/w;-><init>(Ls/g;ZFLA/t;LA/u;)V

    :goto_0
    invoke-virtual {v1, v0}, Ln0/i;->f0(Ln0/h;)V

    iput-object v0, v1, LA/v;->w:Lz/w;

    :cond_2
    :goto_1
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_0
    sget-object v0, LA/D;->b:LD/H;

    invoke-static {v1, v0}, Ln0/C;->h(Ln0/g;LD/k0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/B;

    if-eqz v0, :cond_3

    iget-object v0, v0, LA/B;->b:Lz/h;

    if-nez v0, :cond_4

    :cond_3
    sget-object v0, LA/C;->a:Lz/h;

    :cond_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
