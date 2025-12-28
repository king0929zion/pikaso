.class final Landroidx/compose/ui/focus/FocusPropertiesElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:LU/k;


# direct methods
.method public constructor <init>(LU/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->a:LU/k;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, LU/m;

    invoke-direct {v0}, LP/k;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->a:LU/k;

    iput-object v1, v0, LU/m;->q:LU/k;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, LU/m;

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->a:LU/k;

    iput-object v0, p1, LU/m;->q:LU/k;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusPropertiesElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/focus/FocusPropertiesElement;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->a:LU/k;

    iget-object p1, p1, Landroidx/compose/ui/focus/FocusPropertiesElement;->a:LU/k;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    sget-object v0, LU/h;->f:LU/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FocusPropertiesElement(scope="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->a:LU/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
