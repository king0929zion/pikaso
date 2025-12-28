.class final Landroidx/compose/foundation/BackgroundElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:LW/D;

.field public final c:F

.field public final d:LW/H;


# direct methods
.method public constructor <init>(JLW/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Landroidx/compose/foundation/BackgroundElement;->a:J

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/foundation/BackgroundElement;->b:LW/D;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Landroidx/compose/foundation/BackgroundElement;->c:F

    iput-object p3, p0, Landroidx/compose/foundation/BackgroundElement;->d:LW/H;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 3

    new-instance v0, Lq/j;

    invoke-direct {v0}, LP/k;-><init>()V

    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->a:J

    iput-wide v1, v0, Lq/j;->q:J

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->b:LW/D;

    iput-object v1, v0, Lq/j;->r:LW/D;

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->c:F

    iput v1, v0, Lq/j;->s:F

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->d:LW/H;

    iput-object v1, v0, Lq/j;->t:LW/H;

    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v1, v0, Lq/j;->u:J

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 2

    check-cast p1, Lq/j;

    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->a:J

    iput-wide v0, p1, Lq/j;->q:J

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->b:LW/D;

    iput-object v0, p1, Lq/j;->r:LW/D;

    iget v0, p0, Landroidx/compose/foundation/BackgroundElement;->c:F

    iput v0, p1, Lq/j;->s:F

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->d:LW/H;

    iput-object v0, p1, Lq/j;->t:LW/H;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, Landroidx/compose/foundation/BackgroundElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/BackgroundElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->a:J

    iget-wide v3, p1, Landroidx/compose/foundation/BackgroundElement;->a:J

    invoke-static {v1, v2, v3, v4}, LW/r;->c(JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->b:LW/D;

    iget-object v2, p1, Landroidx/compose/foundation/BackgroundElement;->b:LW/D;

    invoke-static {v1, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->c:F

    iget v2, p1, Landroidx/compose/foundation/BackgroundElement;->c:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->d:LW/H;

    iget-object p1, p1, Landroidx/compose/foundation/BackgroundElement;->d:LW/H;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 3

    sget v0, LW/r;->g:I

    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/BackgroundElement;->b:LW/D;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/BackgroundElement;->c:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->d:LW/H;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
