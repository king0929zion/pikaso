.class public final Lv1/c;
.super Lv1/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lv1/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lv1/b;-><init>()V

    iget-object v0, p0, Lv1/b;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lv1/b;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
