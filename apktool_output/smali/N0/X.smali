.class public final Ln0/X;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ln0/Y;

.field public final synthetic g:LP/k;

.field public final synthetic h:Ln0/V;

.field public final synthetic i:J

.field public final synthetic j:Ln0/n;

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:F


# direct methods
.method public synthetic constructor <init>(Ln0/Y;LP/k;Ln0/V;JLn0/n;ZZFI)V
    .locals 0

    iput p10, p0, Ln0/X;->e:I

    iput-object p1, p0, Ln0/X;->f:Ln0/Y;

    iput-object p2, p0, Ln0/X;->g:LP/k;

    iput-object p3, p0, Ln0/X;->h:Ln0/V;

    iput-wide p4, p0, Ln0/X;->i:J

    iput-object p6, p0, Ln0/X;->j:Ln0/n;

    iput-boolean p7, p0, Ln0/X;->k:Z

    iput-boolean p8, p0, Ln0/X;->l:Z

    iput p9, p0, Ln0/X;->m:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Ln0/X;->e:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ln0/X;->h:Ln0/V;

    invoke-virtual {v1}, Ln0/V;->a()I

    move-result v1

    iget-object v2, v0, Ln0/X;->g:LP/k;

    invoke-static {v2, v1}, Ln0/C;->d(Ln0/h;I)LP/k;

    move-result-object v4

    iget-object v8, v0, Ln0/X;->j:Ln0/n;

    iget-boolean v9, v0, Ln0/X;->k:Z

    iget-object v3, v0, Ln0/X;->f:Ln0/Y;

    iget-object v5, v0, Ln0/X;->h:Ln0/V;

    iget-wide v6, v0, Ln0/X;->i:J

    iget-boolean v10, v0, Ln0/X;->l:Z

    iget v11, v0, Ln0/X;->m:F

    invoke-virtual/range {v3 .. v11}, Ln0/Y;->H0(LP/k;Ln0/V;JLn0/n;ZZF)V

    sget-object v1, Lc2/m;->a:Lc2/m;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Ln0/X;->h:Ln0/V;

    invoke-virtual {v1}, Ln0/V;->a()I

    move-result v1

    iget-object v2, v0, Ln0/X;->g:LP/k;

    invoke-static {v2, v1}, Ln0/C;->d(Ln0/h;I)LP/k;

    move-result-object v1

    iget-boolean v14, v0, Ln0/X;->l:Z

    iget-object v2, v0, Ln0/X;->f:Ln0/Y;

    iget-object v6, v0, Ln0/X;->h:Ln0/V;

    iget-wide v7, v0, Ln0/X;->i:J

    iget-object v15, v0, Ln0/X;->j:Ln0/n;

    iget-boolean v10, v0, Ln0/X;->k:Z

    if-nez v1, :cond_0

    move-object v3, v6

    move-wide v4, v7

    move-object v6, v15

    move v7, v10

    move v8, v14

    invoke-virtual/range {v2 .. v8}, Ln0/Y;->v0(Ln0/V;JLn0/n;ZZ)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v13, Ln0/X;

    iget v12, v0, Ln0/X;->m:F

    const/16 v16, 0x0

    move-object v3, v13

    move-object v4, v2

    move-object v5, v1

    move-object v9, v15

    move v11, v14

    move v2, v12

    move-object v0, v13

    move/from16 v13, v16

    invoke-direct/range {v3 .. v13}, Ln0/X;-><init>(Ln0/Y;LP/k;Ln0/V;JLn0/n;ZZFI)V

    invoke-virtual {v15, v1, v2, v14, v0}, Ln0/n;->b(LP/k;FZLo2/a;)V

    :goto_0
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
