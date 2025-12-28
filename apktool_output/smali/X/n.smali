.class public final synthetic LX/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX/j;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX/r;


# direct methods
.method public synthetic constructor <init>(LX/r;I)V
    .locals 0

    iput p2, p0, LX/n;->a:I

    iput-object p1, p0, LX/n;->b:LX/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(D)D
    .locals 9

    iget v0, p0, LX/n;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LX/n;->b:LX/r;

    iget-object v1, v0, LX/r;->n:LX/j;

    iget v2, v0, LX/r;->e:F

    float-to-double v5, v2

    iget v0, v0, LX/r;->f:F

    float-to-double v7, v0

    move-wide v3, p1

    invoke-static/range {v3 .. v8}, LZ/b;->j(DDD)D

    move-result-wide p1

    invoke-interface {v1, p1, p2}, LX/j;->b(D)D

    move-result-wide p1

    return-wide p1

    :pswitch_0
    iget-object v0, p0, LX/n;->b:LX/r;

    iget-object v1, v0, LX/r;->k:LX/j;

    invoke-interface {v1, p1, p2}, LX/j;->b(D)D

    move-result-wide v2

    iget p1, v0, LX/r;->e:F

    float-to-double v4, p1

    iget p1, v0, LX/r;->f:F

    float-to-double v6, p1

    invoke-static/range {v2 .. v7}, LZ/b;->j(DDD)D

    move-result-wide p1

    return-wide p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
