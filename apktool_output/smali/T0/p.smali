.class public abstract Lt0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lv2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 28

    new-instance v0, Lp2/i;

    const-string v1, "stateDescription"

    const-string v2, "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    invoke-direct {v0, v1, v2}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lp2/p;->a:Lp2/q;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lp2/i;

    const-string v2, "progressBarRangeInfo"

    const-string v3, "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"

    invoke-direct {v1, v2, v3}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lp2/i;

    const-string v3, "paneTitle"

    const-string v4, "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    invoke-direct {v2, v3, v4}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lp2/i;

    const-string v4, "liveRegion"

    const-string v5, "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v3, v4, v5}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lp2/i;

    const-string v5, "focused"

    const-string v6, "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v4, v5, v6}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lp2/i;

    const-string v6, "isContainer"

    const-string v7, "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v5, v6, v7}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lp2/i;

    const-string v7, "isTraversalGroup"

    const-string v8, "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v6, v7, v8}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lp2/i;

    const-string v8, "contentType"

    const-string v9, "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"

    invoke-direct {v7, v8, v9}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v8, Lp2/i;

    const-string v9, "contentDataType"

    const-string v10, "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v8, v9, v10}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lp2/i;

    const-string v10, "traversalIndex"

    const-string v11, "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"

    invoke-direct {v9, v10, v11}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lp2/i;

    const-string v11, "horizontalScrollAxisRange"

    const-string v12, "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"

    invoke-direct {v10, v11, v12}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v11, Lp2/i;

    const-string v12, "verticalScrollAxisRange"

    const-string v13, "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"

    invoke-direct {v11, v12, v13}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, Lp2/i;

    const-string v13, "role"

    const-string v14, "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v12, v13, v14}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lp2/i;

    const-string v14, "testTag"

    const-string v15, "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    invoke-direct {v13, v14, v15}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lp2/i;

    const-string v15, "textSubstitution"

    move-object/from16 v16, v13

    const-string v13, "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"

    invoke-direct {v14, v15, v13}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lp2/i;

    const-string v15, "isShowingTextSubstitution"

    move-object/from16 v17, v14

    const-string v14, "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v13, v15, v14}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lp2/i;

    const-string v15, "editableText"

    move-object/from16 v18, v13

    const-string v13, "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"

    invoke-direct {v14, v15, v13}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lp2/i;

    const-string v15, "textSelectionRange"

    move-object/from16 v19, v14

    const-string v14, "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"

    invoke-direct {v13, v15, v14}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lp2/i;

    const-string v15, "imeAction"

    move-object/from16 v20, v13

    const-string v13, "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v14, v15, v13}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lp2/i;

    const-string v15, "selected"

    move-object/from16 v21, v14

    const-string v14, "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v13, v15, v14}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lp2/i;

    const-string v15, "collectionInfo"

    move-object/from16 v22, v13

    const-string v13, "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"

    invoke-direct {v14, v15, v13}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lp2/i;

    const-string v15, "collectionItemInfo"

    move-object/from16 v23, v14

    const-string v14, "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"

    invoke-direct {v13, v15, v14}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lp2/i;

    const-string v15, "toggleableState"

    move-object/from16 v24, v13

    const-string v13, "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"

    invoke-direct {v14, v15, v13}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lp2/i;

    const-string v15, "isEditable"

    move-object/from16 v25, v14

    const-string v14, "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v13, v15, v14}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lp2/i;

    const-string v15, "maxTextLength"

    move-object/from16 v26, v13

    const-string v13, "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v14, v15, v13}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lp2/i;

    const-string v15, "customActions"

    move-object/from16 v27, v14

    const-string v14, "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;"

    invoke-direct {v13, v15, v14}, Lp2/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v14, 0x1a

    new-array v14, v14, [Lv2/c;

    const/4 v15, 0x0

    aput-object v0, v14, v15

    const/4 v0, 0x1

    aput-object v1, v14, v0

    const/4 v0, 0x2

    aput-object v2, v14, v0

    const/4 v0, 0x3

    aput-object v3, v14, v0

    const/4 v0, 0x4

    aput-object v4, v14, v0

    const/4 v0, 0x5

    aput-object v5, v14, v0

    const/4 v0, 0x6

    aput-object v6, v14, v0

    const/4 v0, 0x7

    aput-object v7, v14, v0

    const/16 v0, 0x8

    aput-object v8, v14, v0

    const/16 v0, 0x9

    aput-object v9, v14, v0

    const/16 v0, 0xa

    aput-object v10, v14, v0

    const/16 v0, 0xb

    aput-object v11, v14, v0

    const/16 v0, 0xc

    aput-object v12, v14, v0

    const/16 v0, 0xd

    aput-object v16, v14, v0

    const/16 v0, 0xe

    aput-object v17, v14, v0

    const/16 v0, 0xf

    aput-object v18, v14, v0

    const/16 v0, 0x10

    aput-object v19, v14, v0

    const/16 v0, 0x11

    aput-object v20, v14, v0

    const/16 v0, 0x12

    aput-object v21, v14, v0

    const/16 v0, 0x13

    aput-object v22, v14, v0

    const/16 v0, 0x14

    aput-object v23, v14, v0

    const/16 v0, 0x15

    aput-object v24, v14, v0

    const/16 v0, 0x16

    aput-object v25, v14, v0

    const/16 v0, 0x17

    aput-object v26, v14, v0

    const/16 v0, 0x18

    aput-object v27, v14, v0

    const/16 v0, 0x19

    aput-object v13, v14, v0

    sput-object v14, Lt0/p;->a:[Lv2/c;

    sget-object v0, Lt0/n;->a:Lt0/q;

    sget-object v0, Lt0/f;->a:Lt0/q;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Lt0/q;
    .locals 1

    new-instance v0, Lt0/q;

    invoke-direct {v0, p0}, Lt0/q;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x1

    iput-boolean p0, v0, Lt0/q;->c:Z

    return-object v0
.end method

.method public static final b(Ljava/lang/String;Lo2/e;)Lt0/q;
    .locals 2

    new-instance v0, Lt0/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1, p1}, Lt0/q;-><init>(Ljava/lang/String;ZLo2/e;)V

    return-object v0
.end method

.method public static final c(Lt0/g;I)V
    .locals 3

    sget-object v0, Lt0/n;->q:Lt0/q;

    sget-object v1, Lt0/p;->a:[Lv2/c;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    new-instance v1, Lt0/e;

    invoke-direct {v1, p1}, Lt0/e;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v0, v1}, Lt0/g;->b(Lt0/q;Ljava/lang/Object;)V

    return-void
.end method
